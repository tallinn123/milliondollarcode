package past_recaps;
import java.io.IOException;
import java.util.Random;

public class PastRecap15Auction {

        public static void main(String[] args) throws IOException {
            System.out.println("Welcome to Ebay your items are published.");
            PastRecap15Auction auction = new PastRecap15Auction();
            PastRecap15Account account = new PastRecap15Account();


            account.printItemsWithPrices();
            System.out.println("---------------------------");
            int totalItemSold = 0;


            while (true) {
                if (totalItemSold == 5) {
                    break;
                }
                String[] itemsInfo = account.getItems();
                int index = auction.findUnsoldIndex(itemsInfo);
                System.out.println("Item is sold:" + itemsInfo[index]);
                account.removeItemSold(index);
                account.addMoneyToAccount(index);
                System.out.println("Your Balance:"+account.getBalance());

                System.out.println("----------");
                System.out.println("Remaining Auctioned Items");
                account.printItemsWithPrices();
                totalItemSold++;
                System.out.println("---------------------------");
            }
        }
        private int findUnsoldIndex(String[] items) {
            Random random = new Random();

            while (true) {
                int itemIndex = random.nextInt(items.length);
                if (!items[itemIndex].isEmpty()) {
                    return itemIndex;
                }
            }
        }
    }