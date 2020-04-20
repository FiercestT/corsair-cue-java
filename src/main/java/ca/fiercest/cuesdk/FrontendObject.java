package ca.fiercest.cuesdk;

abstract class FrontendObject<T>
{
    protected T parent;
    public FrontendObject(T parent)
    {
        this.parent = parent;
    }
}
