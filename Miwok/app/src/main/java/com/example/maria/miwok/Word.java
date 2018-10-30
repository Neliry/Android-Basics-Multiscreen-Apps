package com.example.maria.miwok;

public class Word {

    private String miwokTronslation;
    private String defoultTranslation;
    private int image_id= NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;
    private int audio_id;

    public Word( String defoultTranslation, String miwokTronslation, int audio_id){
        this.miwokTronslation=miwokTronslation;
        this.defoultTranslation=defoultTranslation;
        this.image_id=image_id;
        this.audio_id=audio_id;
    }

    public Word( String defoultTranslation, String miwokTronslation, int image_id, int audio_id){
        this.miwokTronslation=miwokTronslation;
        this.defoultTranslation=defoultTranslation;
        this.image_id=image_id;
        this.audio_id=audio_id;
        }

    public String getMiwokTronslation(){
       return miwokTronslation;
    }

    public String getDefoultTranslation(){
        return defoultTranslation;
    }

    public int getImageResorceId(){
        return image_id;
    }

    public int getAudioResorceId(){
        return audio_id;
    }

    public boolean hesImage(){
        if(image_id==NO_IMAGE_PROVIDED)
            return false;
        else return true;
    }
}
