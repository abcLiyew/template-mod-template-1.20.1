package com.example.regidtry;

import com.example.TemplateMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

/**
 * ClassName : ModItemsMethod
 * Package : com.example.regidtry
 * Description :
 *
 * @author 饿死的流浪猫<br>
 * <b>创建日期</b><br> 2024/6/8 2:26
 * @version 1.0.1
 */

//mod 物品构造方法
public class ModItemsMethod {

    public static Item registerItem(String name, Item item, RegistryKey<ItemGroup>... itemGroups) {
        Item registeredItem = Registry.register(Registries.ITEM,new Identifier(TemplateMod.MOD_ID,name),item);;
        for (RegistryKey<ItemGroup> itemGroup: itemGroups){
            ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(registeredItem));
        }
        return registeredItem;
    }
    public  static void registerModItem(){
        TemplateMod.LOGGER.debug("Registering mod Items for "+TemplateMod.MOD_ID);
        TPP.registerModItem();
    }
}
class TPP{
    public static final Item ItemTpp =ModItemsMethod.registerItem("ItemTpp",new Item(new FabricItemSettings()),ModItemGroup.bibili, ItemGroups.INVENTORY);
    public static final Item bilibili =ModItemsMethod.registerItem("bilibili",new Item(new FabricItemSettings()),ModItemGroup.bibili, ItemGroups.INVENTORY);
    public  static void registerModItem(){
        TemplateMod.LOGGER.debug("Registering mod Items for TPP");
    }
}
