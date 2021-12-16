package com.itayfeder.restored_earth.client.renderer.entities.models;

import com.itayfeder.restored_earth.entities.RainbowSheep;
import net.minecraft.client.model.QuadrupedModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.animal.Sheep;

public class RainbowSheepModel<T extends RainbowSheep> extends QuadrupedModel<T> {
    private float headXRot;

    public RainbowSheepModel(ModelPart p_170903_) {
        super(p_170903_, false, 8.0F, 4.0F, 2.0F, 2.0F, 24);
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = QuadrupedModel.createBodyMesh(12, CubeDeformation.NONE);
        PartDefinition partdefinition = meshdefinition.getRoot();
        partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -4.0F, -6.0F, 6.0F, 6.0F, 8.0F), PartPose.offset(0.0F, 8.0F, -8.0F));
        partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(36, 0).addBox(-4.0F, -10.0F, -7.0F, 8.0F, 16.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 7.0F, 2.0F, ((float)Math.PI / 2F), 0.0F, 0.0F));
        CubeListBuilder cubelistbuilder = CubeListBuilder.create().texOffs(0, 18).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 4.0F);
        partdefinition.addOrReplaceChild("right_hind_leg", cubelistbuilder, PartPose.offset(-3.0F, 14.0F, 7.0F));
        partdefinition.addOrReplaceChild("left_hind_leg", cubelistbuilder, PartPose.offset(3.0F, 14.0F, 7.0F));
        CubeListBuilder cubelistbuilder1 = CubeListBuilder.create().texOffs(16, 18).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 4.0F);
        partdefinition.addOrReplaceChild("right_front_leg", cubelistbuilder1, PartPose.offset(-3.0F, 14.0F, -5.0F));
        partdefinition.addOrReplaceChild("left_front_leg", cubelistbuilder1, PartPose.offset(3.0F, 14.0F, -5.0F));
        return LayerDefinition.create(meshdefinition, 64, 32);
    }

    public void prepareMobModel(T p_103687_, float p_103688_, float p_103689_, float p_103690_) {
        super.prepareMobModel(p_103687_, p_103688_, p_103689_, p_103690_);
        this.head.y = 8.0F + p_103687_.getHeadEatPositionScale(p_103690_) * 9.0F;
        this.headXRot = p_103687_.getHeadEatAngleScale(p_103690_);
    }

    public void setupAnim(T p_103692_, float p_103693_, float p_103694_, float p_103695_, float p_103696_, float p_103697_) {
        super.setupAnim(p_103692_, p_103693_, p_103694_, p_103695_, p_103696_, p_103697_);
        this.head.xRot = this.headXRot;
    }
}