package net.java.springboot_rabbitmq.Customer;

import net.java.springboot_rabbitmq.Dto.Usuario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQJsonConsumer {
    private static  final Logger LOGGER = LoggerFactory.getLogger(RabbitMQJsonConsumer.class);
    @RabbitListener(queues = {"${rabbitmq.queue.json.name}"})
    public void consumeJsonMensaje(Usuario usuario)
    {
        LOGGER.info(String.format("Mensaje JSON recibido -> %s",usuario.toString()));
    }

}
