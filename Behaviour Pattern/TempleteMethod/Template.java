package TempleteMethod;

public abstract class Template {
    public abstract void initialize();

    public abstract void startPlay();

    public abstract void endPlay();

    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }

}
