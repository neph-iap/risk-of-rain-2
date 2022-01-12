package znick_.riskofrain2.item.ror.proc.item;

import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;
import znick_.riskofrain2.api.mc.PlayerData;

public interface OnKeyPressItem {
	public abstract void procOnKeyPress(KeyInputEvent event, PlayerData player, int itemCount);
	public abstract boolean shouldProcOnKeypress(KeyInputEvent event, PlayerData player, int itemCount);
}
