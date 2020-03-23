package ca.fiercest.cuesdk;

public abstract class FrontendObject<T>
{
    protected T parent;
    public FrontendObject(T parent)
    {
        this.parent = parent;
    }
}
