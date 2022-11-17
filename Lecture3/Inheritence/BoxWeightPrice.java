package Lecture3.Inheritence;

public class BoxWeightPrice extends BoxWeight{
    int price;
    BoxWeightPrice() {
        price = 0;
    }

    public BoxWeightPrice(int height, int length, int width, int weight, int price) {
        super(height, length, width, weight);
        this.price = price;
    }
    public BoxWeightPrice(BoxWeightPrice old) {
        super(old.height, old.length, old.width, old.weight);
        this.width = old.width;
        this.height = old.height;
        this.price = old.price;
        this.length = old.length;
        this.weight = old.width;
    }
}
