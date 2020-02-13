public class Rec {
    private int width;
    private int height;

    public Rec(int width, int height) {
        this.width = width;
        this.height = height;
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
}
