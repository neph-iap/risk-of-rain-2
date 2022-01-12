package znick_.riskofrain2.api.ror.items.white;

import net.minecraftforge.event.entity.living.LivingHurtEvent;
import znick_.riskofrain2.api.mc.PlayerData;
import znick_.riskofrain2.api.ror.items.RiskOfRain2Item;
import znick_.riskofrain2.item.ror.proc.item.OnHurtItem;
import znick_.riskofrain2.item.ror.property.ItemCategory;
import znick_.riskofrain2.item.ror.property.ItemRarity;

public class RepulsionArmorPlate extends RiskOfRain2Item implements OnHurtItem {
	
	public RepulsionArmorPlate() {
		super("repulsion_armor_plate");
	}
	
	@Override
	public void procOnHurt(LivingHurtEvent event, PlayerData player,  int itemCount) {
		event.ammount -= itemCount;
	}

	@Override
	public boolean shouldProcOnHurt(LivingHurtEvent event, PlayerData player, int itemCount) {
		return true;
	}

	@Override
	public ItemCategory getCategory() {
		return ItemCategory.UTILITY;
	}

	@Override
	public ItemRarity getRarity() {
		return ItemRarity.WHITE;
	}

	@Override
	public String getDescription() {
		return "Receive flat damage reduction from all attacks.";
	}
}
