package net.minecraft.src;

import net.minecraft.client.Minecraft;

public class CommandClientGive extends CommandGive
{
    public CommandClientGive()
    {
    }

    protected EntityPlayer func_71537_a(String par1Str)
    {
        return Minecraft.getMinecraftInstance().field_71439_g;
    }

    protected String[] func_55240_c()
    {
        return (new String[]
                {
                    Minecraft.getMinecraftInstance().field_71439_g.username
                });
    }
}
