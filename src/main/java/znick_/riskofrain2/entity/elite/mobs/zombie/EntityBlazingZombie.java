package znick_.riskofrain2.entity.elite.mobs.zombie;

import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import znick_.riskofrain2.entity.elite.type.BlazingEntity;

public class EntityBlazingZombie extends EntityZombie implements BlazingEntity {

	public EntityBlazingZombie(World world) {
		super(world);
		this.setCustomNameTag("Blazing Zombie");
	}
	
	public EntityBlazingZombie(World world, double x, double y, double z) {
		this(world);
		this.setPosition(x, y, z);
	}
	
	@Override
	public void onUpdate() {
		super.onUpdate();
		this.updateEliteEntity();
	}

	@Override
	public void updateEliteEntity() {}

}
