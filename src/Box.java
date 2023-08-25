public class Box <I,S>{
    private I height;
    private I width;
    private S color;
    public Box(I height, I width, S color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }


    public I getHeight() {
        return height;
    }

    public void setHeight(I height) {
        this.height = height;
    }

    public I getWidth() {
        return width;
    }

    public void setWidth(I width) {
        this.width = width;
    }

    public S getColor() {
        return color;
    }

    public void setColor(S color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Box{" +
                "height : " + height +
                ", width : " + width +
                ", color : " + color +
                '}';
    }
}
