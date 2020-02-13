public class Rec {
    private int width;
    private int height;
    String color="no color";

    public Rec(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rec(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Rec(){}

    public int getWidth() {        return width;    }

    public void setWidth(int width) {        this.width = width;    }

    public int getHeight() {        return height;    }

    public void setHeight(int height) {        this.height = height;    }


    public int surface(){
      return height*width;

    }
    public int circumference(){
        return 2*height+2*width;
    }

    @Override
    public String toString() {
        return "Rec{" +
                "width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                ", cir='" + circumference() + '\'' +
                ", sur='" + surface() + '\'' +

                '}';
    }
}

