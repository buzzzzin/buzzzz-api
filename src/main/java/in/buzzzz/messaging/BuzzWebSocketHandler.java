package in.buzzzz.messaging;

import in.buzzzz.config.websocket.WebSocketContextHolder;
import org.springframework.util.Assert;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.util.logging.Logger;

/**
 * @author jitendra on 25/9/15.
 */
public class BuzzWebSocketHandler extends TextWebSocketHandler {

    final Logger logger = Logger.getLogger(this.getClass().getName());
    private WebSocketContextHolder socketContextHolder;

    public void setSocketContextHolder(WebSocketContextHolder socketContextHolder) {
        this.socketContextHolder = socketContextHolder;
    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        Assert.notNull(session);
        logger.info("New WebSocket session register " + session.getId());
        socketContextHolder.registerWebSocketSession(session);
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        super.handleTextMessage(session, message);
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        logger.info("Destroying WebSocket session " + session.getId());
        socketContextHolder.removeWebSocketSession(session);
    }
}
