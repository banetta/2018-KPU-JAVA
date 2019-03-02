public class Box {

    int width, height, length;

    public int surface(){
        return 2*((width*height)+(width*length)+(height*length));
    }

    public int volume(){
        return width*height*length;
    }
}
