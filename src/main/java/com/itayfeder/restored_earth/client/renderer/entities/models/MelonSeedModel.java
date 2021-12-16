package com.itayfeder.restored_earth.client.renderer.entities.models;

import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.world.entity.Entity;

public class MelonSeedModel<T extends Entity> extends HierarchicalModel<T> {
    private static final String MAIN = "main";
    private final ModelPart root;

    public MelonSeedModel(ModelPart p_170730_) {
        this.root = p_170730_;
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        int i = 2;
        partdefinition.addOrReplaceChild("main", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F), PartPose.ZERO);
        return LayerDefinition.create(meshdefinition, 16, 16);
    }

    public void setupAnim(T p_103090_, float p_103091_, float p_103092_, float p_103093_, float p_103094_, float p_103095_) {
    }

    public ModelPart root() {
        return this.root;
    }
}