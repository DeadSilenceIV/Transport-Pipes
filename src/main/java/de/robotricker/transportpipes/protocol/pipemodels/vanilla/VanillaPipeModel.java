package de.robotricker.transportpipes.protocol.pipemodels.vanilla;

import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import de.robotricker.transportpipes.pipes.PipeType;
import de.robotricker.transportpipes.pipeutils.PipeColor;
import de.robotricker.transportpipes.pipeutils.PipeDirection;
import de.robotricker.transportpipes.protocol.ArmorStandData;
import de.robotricker.transportpipes.protocol.pipemodels.PipeModel;

public abstract class VanillaPipeModel extends PipeModel {

	protected static final ItemStack ITEM_BLAZE = new ItemStack(Material.BLAZE_ROD);
	protected static final ItemStack ITEM_GOLD_BLOCK = new ItemStack(Material.GOLD_BLOCK);
	protected static final ItemStack ITEM_IRON_BLOCK = new ItemStack(Material.IRON_BLOCK);
	protected static final ItemStack ITEM_ICE_BLOCK = new ItemStack(Material.ICE);
	protected static final ItemStack ITEM_CARPET_WHITE = new ItemStack(Material.CARPET, 1, (short) 0);
	protected static final ItemStack ITEM_CARPET_YELLOW = new ItemStack(Material.CARPET, 1, (short) 4);
	protected static final ItemStack ITEM_CARPET_GREEN = new ItemStack(Material.CARPET, 1, (short) 5);
	protected static final ItemStack ITEM_CARPET_BLUE = new ItemStack(Material.CARPET, 1, (short) 11);
	protected static final ItemStack ITEM_CARPET_RED = new ItemStack(Material.CARPET, 1, (short) 14);
	protected static final ItemStack ITEM_CARPET_BLACK = new ItemStack(Material.CARPET, 1, (short) 15);

	public List<ArmorStandData> createGoldenASD() {
		return null;
	}

	public List<ArmorStandData> createIronASD(PipeDirection outputPd) {
		return null;
	}

	public List<ArmorStandData> createIceASD() {
		return null;
	}

	public List<ArmorStandData> createColoredASD(PipeColor pc) {
		return null;
	}

	public List<ArmorStandData> createASD(PipeType pt, PipeDirection iron_outputPd, PipeColor colored_pipecolor) {
		switch (pt) {
		case COLORED:
			return createColoredASD(colored_pipecolor);
		case GOLDEN:
			return createGoldenASD();
		case ICE:
			return createIceASD();
		case IRON:
			return createIronASD(iron_outputPd);
		default:
			return null;
		}
	}

}