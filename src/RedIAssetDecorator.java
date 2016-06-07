/**
 * Created by Willem on 7-6-2016.
 */
public class RedIAssetDecorator extends AssetDecorator {

    public RedIAssetDecorator(IAsset decoratedIAsset) {
        super(decoratedIAsset);
    }

    @Override
    public void draw() {
        decoratedIAsset.draw();
        setRedIAsset(decoratedIAsset);
    }

    private void setRedIAsset(IAsset decoratedIAsset){
        System.out.println("Colour Red");
    }
}
