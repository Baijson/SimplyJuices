package mod.baijson.simplyjuices.blocks.bushes;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Baijson.
 */
public class BlockMagicalBerryBush extends BlockGenericBerryBush {

    /**
     * @param resource
     * @param material
     */
    protected BlockMagicalBerryBush(ResourceLocation resource, Item material) {
        super(resource, material);
    }

    /**
     * @param resource
     * @param material
     * @return
     */
    public static BlockMagicalBerryBush create(ResourceLocation resource, Item material) {
        BlockMagicalBerryBush self = new BlockMagicalBerryBush(resource, material);
        self.register();

        return self;
    }
}
