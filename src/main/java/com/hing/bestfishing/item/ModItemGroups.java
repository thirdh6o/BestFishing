package com.hing.bestfishing.item;

import com.hing.bestfishing.BestFishingMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final RegistryKey<ItemGroup> BestFishing_GROUP = register("bestfishing_group");
    public static final RegistryKey<ItemGroup> FARM_GROUP = register("farm_group");
    public static final RegistryKey<ItemGroup> COMBAT_GROUP = register("combat_group");


    private static RegistryKey<ItemGroup> register(String id) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(BestFishingMod.MOD_ID, id));
    }


    public static void registerModItemGroups() {
        // 这里本来是不用写什么的，我们可以将注册语句写在这里
        // 在原始注册语句中，我们可以看到一个Registry<ItemGroup>类型的registry，这个其实就是注册表类型，可直接调用原版注册表的东西
        // 注册参数分别是注册表项、注册键、物品栏（其中物品栏创建参数可再分为物品栏位置、展示名字、图标文件、物品栏内容等，不要忘了最后的build）
        Registry.register(
                Registries.ITEM_GROUP,
                BestFishing_GROUP,
                ItemGroup.create(ItemGroup.Row.TOP, 7)
                        .displayName(Text.translatable("itemGroup.bestfishing_group"))
                        .icon(() -> new ItemStack(ModItems.HETUN))

                        .entries((displayContext, entries) -> {
                            entries.add(ModItems.SHENGYUPIAN);
                            entries.add(ModItems.HETUN);
                            entries.add(ModItems.TIYU);
                            entries.add(ModItems.JINQIANGYU);
                            entries.add(ModItems.SHADINGYU);
                            entries.add(ModItems.CHOUYU);
                            entries.add(ModItems.DAZUILUYU);
                            entries.add(ModItems.XIAOZUILUYU);
                            entries.add(ModItems.HONGZUNYU);
                            entries.add(ModItems.GUIYU);
                            entries.add(ModItems.DAYANYU);
                            entries.add(ModItems.HELU);
                            entries.add(ModItems.LIYU);
                            entries.add(ModItems.NIANYU);
                            entries.add(ModItems.GOUYU);
                            entries.add(ModItems.TAIYANGYU);
                            entries.add(ModItems.HONGJIYU);
                            entries.add(ModItems.FEIYU);
                            entries.add(ModItems.MANYU);
                            entries.add(ModItems.ZHANGYU);
                            entries.add(ModItems.HONGDIAOYU);
                            entries.add(ModItems.YOUYU);
                            entries.add(ModItems.HAISHEN);
                            entries.add(ModItems.DAHAISHEN);
                            entries.add(ModItems.GUI3YU);
                            entries.add(ModItems.SHIYU);
                            entries.add(ModItems.BINGZHUYU);
                            entries.add(ModItems.YANJIANGMANYU);
                            entries.add(ModItems.SHAYU);
                            entries.add(ModItems.XIELIYU);
                            entries.add(ModItems.BIMUYU);
                            entries.add(ModItems.WUYELIYU);
                            entries.add(ModItems.XUNYU);
                            entries.add(ModItems.HUWENZUNYU);
                            entries.add(ModItems.DATOUYU);
                            entries.add(ModItems.LUOFEIYU);
                            entries.add(ModItems.LIANYU);
                            entries.add(ModItems.MAHAZHILI);
                            entries.add(ModItems.QINGHUAYU);
                            entries.add(ModItems.XIFEI);
                            entries.add(ModItems.SHECHIDANXIANYU);
                            entries.add(ModItems.DABIMUYU);
                            entries.add(ModItems.MUYUEYU);
                            entries.add(ModItems.XUKONGGUIYU);
                            entries.add(ModItems.SHILAIMU);
                            entries.add(ModItems.HUANGDIAOYU);
                            entries.add(ModItems.SHIZIYU);
                            entries.add(ModItems.LANTIEBINGYU);
                            entries.add(ModItems.XIAHUYU);
                            entries.add(ModItems.WUYEYOUYU);
                            entries.add(ModItems.YOULINGYU);
                            entries.add(ModItems.SHUIDIYU);
                            entries.add(ModItems.FEIHONGYU);
                            entries.add(ModItems.ANKANGYU);
                            entries.add(ModItems.CHUANSHUOZHIYU);
                            entries.add(ModItems.BINGCHUANYU);
                            entries.add(ModItems.BIANZHONGLIYU);
                            entries.add(ModItems.FEIHONGYUZHIZI);
                            entries.add(ModItems.CIANKANGYU);
                            entries.add(ModItems.CHUANSHUOZHIYUERDAI);
                            entries.add(ModItems.XIAOBINGCHUANYU);
                            entries.add(ModItems.FANGSHEXINGLIYU);
                            entries.add(ModItems.BROKEN_CD);
                            entries.add(ModItems.BROKEN_GLASSES);
                            entries.add(ModItems.DRIFTWOOD);
                            entries.add(ModItems.JOJA_COLA);
                            entries.add(ModItems.ROTTEN_PLANT);
                            entries.add(ModItems.SOGGY_NEWSPAPER);
                            entries.add(ModItems.TRASH);
                        }).build());



        Registry.register( Registries.ITEM_GROUP,
                FARM_GROUP,
                ItemGroup.create(ItemGroup.Row.BOTTOM, 7)
                        .displayName(Text.translatable("itemGroup.farm_group"))
                        .icon(() -> new ItemStack(ModItems.HETUN))
                        .entries((displayContext, entries) -> {
                            entries.add(ModItems.SHENGYUPIAN);
                        }).build());


        Registry.register( Registries.ITEM_GROUP,
                COMBAT_GROUP,
                ItemGroup.create(ItemGroup.Row.TOP, 8)
                        .displayName(Text.translatable("itemGroup.combat_group"))
                        .icon(() -> new ItemStack(ModItems.MEOWMERE))
                        .entries((displayContext, entries) -> {
                            entries.add(ModItems.BONE_SWORD);
                            entries.add(ModItems.CLAYMORE);
                            entries.add(ModItems.CUTLASS);
                            entries.add(ModItems.DARK_SWORD);
                            entries.add(ModItems.DRAGONTOOTH_CUTLASS);
                            entries.add(ModItems.DWARF_SWORD);
                            entries.add(ModItems.FOREST_SWORD);
                            entries.add(ModItems.GALAXY_SWORD);
                            entries.add(ModItems.HALEYS_IRON);
                            entries.add(ModItems.HOLY_BLADE);
                            entries.add(ModItems.INFINITY_BLADE);
                            entries.add(ModItems.INSECT_HEAD);
                            entries.add(ModItems.IRON_EDGE);
                            entries.add(ModItems.LAVA_KATANA);
                            entries.add(ModItems.LEAHS_WHITTLER);
                            entries.add(ModItems.MEOWMERE);
                            entries.add(ModItems.NEPTUNES_GLAIVE);
                            entries.add(ModItems.OBSIDIAN_EDGE);
                            entries.add(ModItems.OSSIFIED_BLADE);
                            entries.add(ModItems.PIRATES_SWORD);
                            entries.add(ModItems.RUSTY_SWORD);
                            entries.add(ModItems.SILVER_SABER);
                            entries.add(ModItems.STEEL_FALCHION);
                            entries.add(ModItems.STEEL_SMALLSWORD);
                            entries.add(ModItems.TEMPERED_BROADSWORD);
                            entries.add(ModItems.TEMPLARS_BLADE);
                            entries.add(ModItems.YETI_TOOTH);
                        }).build());

    }
}