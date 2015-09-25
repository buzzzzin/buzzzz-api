package in.buzzzz.config.websocket;

import in.buzzzz.messaging.BuzzWebSocketHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

/**
 * @author jitendra on 25/9/15.
 */
@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry
                .addHandler(webSocketHandler(), "/buzz/chat/**", "/buzz/publish/**", "/buzz/channel/**")
                .setAllowedOrigins("*");
    }

    @Bean
    public WebSocketHandler webSocketHandler() {
        BuzzWebSocketHandler buzzWebSocketHandler = new BuzzWebSocketHandler();
        buzzWebSocketHandler.setSocketContextHolder(socketContextHolder());
        return buzzWebSocketHandler;
    }

    @Bean
    public WebSocketContextHolder socketContextHolder() {
        return new WebSocketContextHolder();
    }
}
