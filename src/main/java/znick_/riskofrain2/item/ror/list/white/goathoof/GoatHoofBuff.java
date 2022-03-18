package znick_.riskofrain2.item.ror.list.white.goathoof;

import net.minecraft.util.ResourceLocation;
import znick_.riskofrain2.api.mc.data.AbstractEntityData;
import znick_.riskofrain2.api.ror.buff.PlayerStat;
import znick_.riskofrain2.api.ror.buff.StatBuff;
import znick_.riskofrain2.item.RiskOfRain2Items;
import znick_.riskofrain2.item.ror.RiskOfRain2Item;

public class GoatHoofBuff extends StatBuff {

	public GoatHoofBuff(int itemCount) {
		super(PlayerStat.MOVEMENT_SPEED_MULTIPLIER, itemCount, RiskOfRain2Items.GOAT_HOOF);
	}

	@Override
	public ResourceLocation getIconTexture() {
		return null;
	}

	@Override
	public double getStatAdditionAmount(AbstractEntityData entity) {
		return this.getItemCount() * 0.14;
	}

}
