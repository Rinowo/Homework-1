package shop;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Repository repository = new Repository();
        Scanner sc = new Scanner(System.in);
        //Menu.mainMenu();
        int choose;

        do {
            Menu.mainMenu();
            choose = sc.nextInt();
            sc.nextLine();

            switch (choose) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Danh sách sản phẩm");
                    repository.show();
                    break;
                case 2:
                    System.out.println("Sản phẩm có giá trên 10000: ");
                    repository.filtedProductByPrice();
                    break;
                case 3:
                    repository.countProductByAmountSale();
                    break;
                case 4:
                    repository.listProductByCategory();
                    break;
                case 5:
                    repository.sortByBestSellingItems();
                    repository.show();
                    break;
                case 6:
                    repository.bestSellingItem();

                    break;
                case 7:
                    repository.sortProductByName();
                    break;
            }
        }while (choose != 0);


    }
}
