package com.example.regidtry;

import com.example.TemplateMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

/**
 * ClassName : ModItemGroup
 * Package : com.example.regidtry
 * Description :
 *
 * @author 饿死的流浪猫<br>
 * <b>创建日期</b><br> 2024/6/8 上午3:24
 * @version 1.0.1
 */
public class ModItemGroup {
    public static final RegistryKey<ItemGroup> bibili = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(TemplateMod.MOD_ID, "bilibili"));
    public static void registerModGroup(){
            TemplateMod.LOGGER.info("注册物品组");
            Registry.register(Registries.ITEM_GROUP, bibili,
                    FabricItemGroup.builder().displayName(Text.translatable("item.Template.mod.bilibili"))//组名
                        .icon(()->new ItemStack(TPP.bilibili))//设置组的图标
                        .build());

    }
}
