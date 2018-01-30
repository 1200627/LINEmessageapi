package sample;


import com.sun.corba.se.impl.protocol.giopmsgheaders.ReplyMessage;

import java.util.concurrent.ExecutionException;

public class response {

    final LineMessagingClient client = LineMessagingClient
            .builder("V7z7x+GCc/BbuIa+AZ5BCCWr0nF8EVgCEhXktPKX+86Rs8cFH72XZLYQcqkl0BeHgYY7xW6QAXN21ZURb8zgaM+K7hLe3OlYMy38ZpbeOfnMswS1K4xf8BQuAAbyi/AH9SWVmc1UPoqv5tfS7JKehwdB04t89/1O/w1cDnyilFU=")
            .build();

    final TextMessage textMessage = new TextMessage("hello");
    final ReplyMessage replyMessage = new ReplyMessage(
            "nHuyWiB7yP5Zw52FIkcQobQuGDXCTA",
            textMessage);

    final BotApiResponse botApiResponse;
        try {
        botApiResponse = client.replyMessage(replyMessage).get();
    } catch (InterruptedException | ExecutionException e) {
        e.printStackTrace();
        return;
    }

        System.out.println(botApiResponse);

}
