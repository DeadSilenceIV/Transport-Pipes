package de.robotricker.transportpipes.ducts.pipe;

import org.bukkit.Chunk;
import org.bukkit.World;

import de.robotricker.transportpipes.ducts.types.BaseDuctType;
import de.robotricker.transportpipes.ducts.types.DuctType;
import de.robotricker.transportpipes.location.BlockLocation;

public class CraftingPipe extends Pipe {

    public CraftingPipe(DuctType ductType, BlockLocation blockLoc, World world, Chunk chunk) {
        super(ductType, blockLoc, world, chunk);
    }
}