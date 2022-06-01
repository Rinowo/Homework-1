package shop;

import java.util.*;

public class Repository {
    Scanner sc = new Scanner(System.in);
    List<Product> listProduct = new ArrayList<>();

    int choose;

    public Repository() {
        listProduct.add(new Product("01", "Bánh Dorayaki 3 vị", Category.FOOD, 100, 3500, 57));
        listProduct.add(new Product("02", "Xúc xích sườn non", Category.FOOD, 150, 3500, 12));
        listProduct.add(new Product("03", "Thanh cua", Category.FOOD, 100, 5000, 85));
        listProduct.add(new Product("04", "Bánh khoai môn", Category.FOOD, 200, 4200, 78));
        listProduct.add(new Product("05", "Thìa ăn cơm inox mạ vàng", Category.HOUSEWARE, 50, 8000, 4));
        listProduct.add(new Product("06", "Bát đựng gia vị", Category.HOUSEWARE, 65, 4000, 44));
        listProduct.add(new Product("07", "Nước Hoa Creed 100ml", Category.COSMETICS, 140, 59000, 88));
        listProduct.add(new Product("08", "Combo gội xả HAIRBRUST", Category.COSMETICS, 100, 639000, 7));
        listProduct.add(new Product("09", "Tinh chất dưỡng ẩm sâu Klairs Rich Moist Soothing Serum", Category.COSMETICS, 50, 249000, 24));
        listProduct.add(new Product("10", "Kem dưỡng thể Paula's Choice RESIST WEIGHTLESS BODY TREATMENT", Category.COSMETICS, 80, 715000, 63));
        listProduct.add(new Product("11", "Áo thun TSUN", Category.FASHION, 250, 320000, 146));
    }

    public void show() {
        //Sử dụng foreach
//        for (Product product : listProduct) {
//            System.out.println(product);
//        }
        //Sử dụng lambda
        listProduct.forEach(product -> System.out.println(product));
    }

    public void sortProductByName() {
        //Sử dụng comparator
//        listProduct.sort(new Comparator<Product>() {
//            @Override
//            public int compare(Product o1, Product o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

        //Sử dụng lambda
        listProduct.sort(((o1, o2) -> o1.getName().compareTo(o2.getName())));
    }

    public void filtedProductByPrice() {
        //Sử dụng foreach
//        for (Product product : listProduct) {
//            if (product.getPrice() > 10000){
//                System.out.println(product);
//            }
//        }

        //Sử dụng lambda và stream
        listProduct.stream()
                .filter(product -> product.getPrice() > 10000)
                .forEach(product -> System.out.println(product));
    }

    public void countProductByAmountSale() {
        long count = listProduct.stream()
                .filter(product -> product.getAmountSale() >= 50)
                .count();

        System.out.println("Số lượng sản phẩm bán được từ 50 trở lên là: " + count);
    }

    public void listProductByCategory(){
        Menu.chooseCategory();
        choose = sc.nextInt();
        sc.nextLine();
        if (choose == 1) {
            for (Product product :
                    listProduct) {
                if (product.getCategory().equals(Category.FOOD)){
                    System.out.println(product);
                }
            }
        }

        else if (choose == 2) {
            for (Product product :
                    listProduct) {
                if (product.getCategory().equals(Category.HOUSEWARE)){
                    System.out.println(product);
                }
            }
        }

    }

    public void sortByBestSellingItems(){
        Collections.sort(listProduct, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getAmountSale() > o2.getAmountSale()) {
                    return -1;
                }
                else if (o1.getAmountSale() < o2.getAmountSale()) {
                    return 1;
                }
                else {
                    return 0;
                }
            }
        });
    }
//    long maxSale = listProduct
//            .stream()
//            .map(Product::getAmountSale).max(Long::compare).get();
//
    public void bestSellingItem() {
        Collections.sort(listProduct, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getAmountSale() > o2.getAmountSale()) {
                    return -1;
                }
                else if (o1.getAmountSale() < o2.getAmountSale()) {
                    return 1;
                }
                else {
                    return 0;
                }
            }
        });

        System.out.println(listProduct.get(1));
    }


}
