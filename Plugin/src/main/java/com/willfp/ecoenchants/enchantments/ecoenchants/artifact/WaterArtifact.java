package com.willfp.ecoenchants.enchantments.ecoenchants.artifact;

import com.willfp.ecoenchants.enchantments.itemtypes.Artifact;
import org.bukkit.Particle;
public final class WaterArtifact extends Artifact {
    public WaterArtifact() {
        super(
                "water_artifact"
        );
    }

    @Override
    protected Particle getParticle() {
        return Particle.DRIP_WATER;
    }
}