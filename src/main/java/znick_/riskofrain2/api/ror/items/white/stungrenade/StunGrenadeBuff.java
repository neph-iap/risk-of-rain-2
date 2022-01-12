package znick_.riskofrain2.api.ror.items.white.stungrenade;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import znick_.riskofrain2.api.mc.PlayerData;
import znick_.riskofrain2.api.ror.buff.DurationBuff;
import znick_.riskofrain2.event.Tick;

public class StunGrenadeBuff extends DurationBuff {

	public StunGrenadeBuff(int itemCount) {
		super(itemCount, Tick.fromSeconds(2));
	}

	@Override
	public void applyEffect(PlayerData player) { //TODO: Update buffs to be applicable to any entity
		player.getPlayer().motionX = 0;
		player.getPlayer().motionY = 0;
		player.getPlayer().motionZ = 0;
	}

	@Override
	public ResourceLocation getIconTexture() {
		return null;
	}

	@Override
	public void removeEffect(PlayerData player) {
		
	}

	@Override
	public boolean isDebuff() {
		return true;
	}
}
