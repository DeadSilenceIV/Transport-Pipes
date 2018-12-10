package de.robotricker.transportpipes.ducts.pipe;

import org.bukkit.Chunk;
import org.bukkit.World;

import de.robotricker.transportpipes.ducts.types.DuctType;
import de.robotricker.transportpipes.ducts.types.pipetype.ColoredPipeType;
import de.robotricker.transportpipes.location.BlockLocation;

public class ColoredPipe extends Pipe {

    public ColoredPipe(DuctType ductType, BlockLocation blockLoc, World world, Chunk chunk) {
        super(ductType, blockLoc, world, chunk);
    }

}