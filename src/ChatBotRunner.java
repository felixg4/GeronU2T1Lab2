public class ChatBotRunner {
    public static void main(String[] args) {
        ChatBot chatBot = new ChatBot("Bob", 3);
        chatBot.greeting("Felix");
        chatBot.weather();
        chatBot.music();
        chatBot.favoriteNumber(2);
        System.out.println("But another favorite number of mine is " + chatBot.ultimateFavoriteNumber());
        System.out.println(chatBot.convertFeetToMeters(chatBot.addNumbers(1, 2, 3)));
        System.out.print(chatBot.goodbye());
    }
}
