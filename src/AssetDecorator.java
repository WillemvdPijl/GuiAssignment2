/**
 * Created by Willem on 7-6-2016.
 */
public abstract class AssetDecorator implements IAsset {
    protected IAsset decoratedIAsset;

    public AssetDecorator(IAsset decoratedIAsset){
        this.decoratedIAsset = decoratedIAsset;
    }
    @Override
    public void draw() {
        decoratedIAsset.draw();
    }
}
