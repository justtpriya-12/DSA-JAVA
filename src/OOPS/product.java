//creat a class product with private member product name, price name is not null price should be greater than zero. display
package OOPS;

class Products {
    private String name;
    private int price;

    public void setname(String id) {
        if (id != "") {
            name = id ;
        } else {
            System.out.println("Name not be null.");
        }
    }

    public String getname() {
        return name;
    }

    public void setprice(int p) {
        if (p > 0) {
            price = p;
        } else {
            System.out.println("price not be less than 0");
        }
    }

    public int getprice() {
        return price;
    }
    public class product {
        public static void main(String[] args) {
            Products p = new Products();

            p.setname("Priya");
            p.setprice(1000);

            System.out.println("Pname: " + p.getname());
            System.out.println("price: " + p.getprice());
        }
    }
}
