package Lecture3.Inheritence;

public class BoxWeight extends Box{
    int weight;
    public BoxWeight() {
        weight = -1;
    }
    public BoxWeight(int height, int length, int width, int weight) {
        super(height, length, width);
        this.weight = weight;
    }
}
