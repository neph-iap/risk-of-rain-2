package znick_.riskofrain2.api.ror.items.proc.type;

import net.minecraftforge.event.entity.player.PlayerPickupXpEvent;
import znick_.riskofrain2.api.mc.data.PlayerData;

public interface OnPickupXPItem {

	public abstract void procOnXPPickup(PlayerPickupXpEvent event, PlayerData player, int itemCount);
}