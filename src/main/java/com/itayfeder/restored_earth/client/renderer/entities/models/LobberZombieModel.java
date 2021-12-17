package com.itayfeder.restored_earth.client.renderer.entities.models;

import com.itayfeder.restored_earth.entities.BoulderingZombieEntity;
import com.itayfeder.restored_earth.entities.LobberZombieEntity;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelHelper;
import net.minecraft.client.renderer.model.ModelRenderer;

public class LobberZombieModel<T extends LobberZombieEntity> extends BipedModel<T> {
    public LobberZombieModel(float p_i1168_1_) {
        this(p_i1168_1_, 0.0F, 64, 64);
    }

    protected LobberZombieModel(float p_i51070_1_, float p_i51070_2_, int p_i51070_3_, int p_i51070_4_) {
        super(p_i51070_1_, p_i51070_2_, p_i51070_3_, p_i51070_4_);
        this.texHeight = 64;
        this.texWidth = 64;

        this.hat.visible = false;
        this.rightArm = new ModelRenderer(this, 32, 16);
        this.rightArm.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 11.0F, 4.0F, p_i51070_2_);
        this.rightArm.setPos(-5.0F, 2.0F + p_i51070_2_, 0.0F);
        this.leftArm = new ModelRenderer(this, 32, 32);
        this.leftArm.addBox(-1.0F, -2.0F, -2.0F, 5.0F, 14.0F, 4.0F, p_i51070_2_);
        this.leftArm.setPos(5.0F, 2.0F + p_i51070_2_, 0.0F);

        this.rightLeg = new ModelRenderer(this, 0, 16);
        this.rightLeg.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, p_i51070_2_);
        this.rightLeg.setPos(-1.9F, 12.0F + p_i51070_2_, 0.0F);
        this.leftLeg = new ModelRenderer(this, 16, 16);
        this.leftLeg.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, p_i51070_2_);
        this.leftLeg.setPos(1.9F, 12.0F + p_i51070_2_, 0.0F);

        this.body = new ModelRenderer(this, 0, 32);
        this.body.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, p_i51070_2_);
        this.body.setPos(0.0F, 0.0F + p_i51070_2_, 0.0F);
    }

    public void setupAnim(T p_225597_1_, float p_225597_2_, float p_225597_3_, float p_225597_4_, float p_225597_5_, float p_225597_6_) {
        super.setupAnim(p_225597_1_, p_225597_2_, p_225597_3_, p_225597_4_, p_225597_5_, p_225597_6_);
        ModelHelper.animateZombieArms(this.leftArm, this.rightArm, this.isAggressive(p_225597_1_), this.attackTime, p_225597_4_);
    }

    public boolean isAggressive(T p_212850_1_) {
        return p_212850_1_.isAggressive();
    }
}