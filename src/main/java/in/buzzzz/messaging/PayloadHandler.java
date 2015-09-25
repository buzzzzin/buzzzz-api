package in.buzzzz.messaging;

import com.fasterxml.jackson.databind.ObjectMapper;
import in.buzzzz.config.websocket.ChannelContextHolder;
import in.buzzzz.config.websocket.WebSocketContextHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

/**
 * @author jitendra on 26/9/15.
 */
public class PayloadHandler {
    final Logger logger = Logger.getLogger(this.getClass().getName());
    ObjectMapper objectMapper = new ObjectMapper();
    ChannelContextHolder channelContextHolder;
    WebSocketContextHolder webSocketContextHolder;

    void handlePayload(WebSocketSession session, WebSocketMessage message) throws IOException {
        System.out.println("Object Mapper is [ " + objectMapper + " ]");
        if (message != null) {
            logger.info("Handling payload started");
            String payloadString = (String) message.getPayload();
            logger.info("payload String is -- " + payloadString + " --");
            Payload payload = objectMapper.readValue(payloadString, Payload.class);
            logger.info("Object created -- " + payload + " --");
            if (payload != null) {
                logger.info("Destination -- " + payload.getDestination() + " --");
                logger.info("Message -- " + payload.getMessage() + " --");
                List<String> sessionIds = channelContextHolder.getSessions(payload.getDestination());
                logger.info(" Session Ids -- "+sessionIds+" --");
                for (String sessionId : sessionIds) {
                    logger.info("Sending message to -- "+sessionId+" --");
                    webSocketContextHolder.getWebSocketSession(sessionId).sendMessage(new TextMessage(payload.getMessage()));
                }
            }
        }
    }

    public void setChannelContextHolder(ChannelContextHolder channelContextHolder) {
        this.channelContextHolder = channelContextHolder;
    }

    public void setWebSocketContextHolder(WebSocketContextHolder webSocketContextHolder) {
        this.webSocketContextHolder = webSocketContextHolder;
    }
}
