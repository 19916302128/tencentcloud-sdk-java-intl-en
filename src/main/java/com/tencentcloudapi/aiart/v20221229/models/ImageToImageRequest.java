/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.aiart.v20221229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageToImageRequest extends AbstractModel {

    /**
    * Base64 code of the input mage.
Either the Base64 code or URL must be provided. If both are provided, URL prevails.
Image restrictions: The single-edge resolution must be less than 5,000 and greater than 50, and the size after Base64 encoding must be less than 8 MB. Supported formats include JPG, JPEG, PNG, BMP, TIFF and WEBP.
    */
    @SerializedName("InputImage")
    @Expose
    private String InputImage;

    /**
    * URL of the input mage.
Either the Base64 code or URL must be provided. If both are provided, URL prevails.
Image restrictions: The single-edge resolution must be less than 5,000 and greater than 50, and the size after Base64 encoding must be less than 8 MB. Supported formats include JPG, JPEG, PNG, BMP, TIFF and WEBP.
    */
    @SerializedName("InputUrl")
    @Expose
    private String InputUrl;

    /**
    * Text description.
It is used to increase the possibility that the generation result contains the described content.
Chinese is recommended. A maximum of 256 UTF-8 characters are supported.
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * Negative text description.
It is used to reduce the possibility that the generation result contains the described content, but such content cannot be completely avoided.
Chinese is recommended. A maximum of 256 UTF-8 characters are supported.
    */
    @SerializedName("NegativePrompt")
    @Expose
    private String NegativePrompt;

    /**
    * Image style.
Select the desired style from the [Image Style List](https://intl.cloud.tencent.com/document/product/1668/86250?from_cn_redirect=1) and enter the style number.
It is recommended to use only one style. If no style is specified, 201 (anime style) is used by default.
    */
    @SerializedName("Styles")
    @Expose
    private String [] Styles;

    /**
    * Configurations of the generated image, including the resolution.
Images with the following resolutions can be generated: origin (The resolution is the same as the input image resolution, with the edge resolution of up to 2000. The image will be zoomed out proportionally if the resolution is exceeded.), 768:768 (1:1), 768:1024 (3:4), and 1024:768 (4:3).
If the resolution is not specified, origin is used by default.
    */
    @SerializedName("ResultConfig")
    @Expose
    private ResultConfig ResultConfig;

    /**
    * Switch indicating whether to add a logo to the generated image. Default value: 1.
1: add logo
0: do not add logo
Other values: add logo
It is recommended to use an obvious logo to indicate that the image result is generated by AI.
    */
    @SerializedName("LogoAdd")
    @Expose
    private Long LogoAdd;

    /**
    * Logo content settings.
By default, the text "Generated by AI" is added to the bottom right corner of the generated image. You can also use other logo.
    */
    @SerializedName("LogoParam")
    @Expose
    private LogoParam LogoParam;

    /**
    * Generation strength.
The smaller the strength value, the more the generated image resembles the original image. Value range: (0, 1]. If the strength is not specified, the default value of the model is used.
The recommended value range is 0.6 to 0.8.
    */
    @SerializedName("Strength")
    @Expose
    private Float Strength;

    /**
    * Image return method (base64 or url).
You can specify only one method. Default value: base64.
The URL is valid for 1 hour.
    */
    @SerializedName("RspImgType")
    @Expose
    private String RspImgType;

    /**
    * Switch indicating whether to  enhance image clarity. Default value: 0.
1: on
0: off
If the switch is turned on, the image clarity will be enhanced, but the generation time will increase.
    */
    @SerializedName("EnhanceImage")
    @Expose
    private Long EnhanceImage;

    /**
    * Maximum number of faces for detail restoration. Value range: 0 - 6. Default value: 0.
If the input value is greater than 0, the value will be used as the maximum number of faces with a small area can be restored in each image. The generation time will increase according to the actual number of faces restored.
    */
    @SerializedName("RestoreFace")
    @Expose
    private Long RestoreFace;

    /**
     * Get Base64 code of the input mage.
Either the Base64 code or URL must be provided. If both are provided, URL prevails.
Image restrictions: The single-edge resolution must be less than 5,000 and greater than 50, and the size after Base64 encoding must be less than 8 MB. Supported formats include JPG, JPEG, PNG, BMP, TIFF and WEBP. 
     * @return InputImage Base64 code of the input mage.
Either the Base64 code or URL must be provided. If both are provided, URL prevails.
Image restrictions: The single-edge resolution must be less than 5,000 and greater than 50, and the size after Base64 encoding must be less than 8 MB. Supported formats include JPG, JPEG, PNG, BMP, TIFF and WEBP.
     */
    public String getInputImage() {
        return this.InputImage;
    }

    /**
     * Set Base64 code of the input mage.
Either the Base64 code or URL must be provided. If both are provided, URL prevails.
Image restrictions: The single-edge resolution must be less than 5,000 and greater than 50, and the size after Base64 encoding must be less than 8 MB. Supported formats include JPG, JPEG, PNG, BMP, TIFF and WEBP.
     * @param InputImage Base64 code of the input mage.
Either the Base64 code or URL must be provided. If both are provided, URL prevails.
Image restrictions: The single-edge resolution must be less than 5,000 and greater than 50, and the size after Base64 encoding must be less than 8 MB. Supported formats include JPG, JPEG, PNG, BMP, TIFF and WEBP.
     */
    public void setInputImage(String InputImage) {
        this.InputImage = InputImage;
    }

    /**
     * Get URL of the input mage.
Either the Base64 code or URL must be provided. If both are provided, URL prevails.
Image restrictions: The single-edge resolution must be less than 5,000 and greater than 50, and the size after Base64 encoding must be less than 8 MB. Supported formats include JPG, JPEG, PNG, BMP, TIFF and WEBP. 
     * @return InputUrl URL of the input mage.
Either the Base64 code or URL must be provided. If both are provided, URL prevails.
Image restrictions: The single-edge resolution must be less than 5,000 and greater than 50, and the size after Base64 encoding must be less than 8 MB. Supported formats include JPG, JPEG, PNG, BMP, TIFF and WEBP.
     */
    public String getInputUrl() {
        return this.InputUrl;
    }

    /**
     * Set URL of the input mage.
Either the Base64 code or URL must be provided. If both are provided, URL prevails.
Image restrictions: The single-edge resolution must be less than 5,000 and greater than 50, and the size after Base64 encoding must be less than 8 MB. Supported formats include JPG, JPEG, PNG, BMP, TIFF and WEBP.
     * @param InputUrl URL of the input mage.
Either the Base64 code or URL must be provided. If both are provided, URL prevails.
Image restrictions: The single-edge resolution must be less than 5,000 and greater than 50, and the size after Base64 encoding must be less than 8 MB. Supported formats include JPG, JPEG, PNG, BMP, TIFF and WEBP.
     */
    public void setInputUrl(String InputUrl) {
        this.InputUrl = InputUrl;
    }

    /**
     * Get Text description.
It is used to increase the possibility that the generation result contains the described content.
Chinese is recommended. A maximum of 256 UTF-8 characters are supported. 
     * @return Prompt Text description.
It is used to increase the possibility that the generation result contains the described content.
Chinese is recommended. A maximum of 256 UTF-8 characters are supported.
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set Text description.
It is used to increase the possibility that the generation result contains the described content.
Chinese is recommended. A maximum of 256 UTF-8 characters are supported.
     * @param Prompt Text description.
It is used to increase the possibility that the generation result contains the described content.
Chinese is recommended. A maximum of 256 UTF-8 characters are supported.
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get Negative text description.
It is used to reduce the possibility that the generation result contains the described content, but such content cannot be completely avoided.
Chinese is recommended. A maximum of 256 UTF-8 characters are supported. 
     * @return NegativePrompt Negative text description.
It is used to reduce the possibility that the generation result contains the described content, but such content cannot be completely avoided.
Chinese is recommended. A maximum of 256 UTF-8 characters are supported.
     */
    public String getNegativePrompt() {
        return this.NegativePrompt;
    }

    /**
     * Set Negative text description.
It is used to reduce the possibility that the generation result contains the described content, but such content cannot be completely avoided.
Chinese is recommended. A maximum of 256 UTF-8 characters are supported.
     * @param NegativePrompt Negative text description.
It is used to reduce the possibility that the generation result contains the described content, but such content cannot be completely avoided.
Chinese is recommended. A maximum of 256 UTF-8 characters are supported.
     */
    public void setNegativePrompt(String NegativePrompt) {
        this.NegativePrompt = NegativePrompt;
    }

    /**
     * Get Image style.
Select the desired style from the [Image Style List](https://intl.cloud.tencent.com/document/product/1668/86250?from_cn_redirect=1) and enter the style number.
It is recommended to use only one style. If no style is specified, 201 (anime style) is used by default. 
     * @return Styles Image style.
Select the desired style from the [Image Style List](https://intl.cloud.tencent.com/document/product/1668/86250?from_cn_redirect=1) and enter the style number.
It is recommended to use only one style. If no style is specified, 201 (anime style) is used by default.
     */
    public String [] getStyles() {
        return this.Styles;
    }

    /**
     * Set Image style.
Select the desired style from the [Image Style List](https://intl.cloud.tencent.com/document/product/1668/86250?from_cn_redirect=1) and enter the style number.
It is recommended to use only one style. If no style is specified, 201 (anime style) is used by default.
     * @param Styles Image style.
Select the desired style from the [Image Style List](https://intl.cloud.tencent.com/document/product/1668/86250?from_cn_redirect=1) and enter the style number.
It is recommended to use only one style. If no style is specified, 201 (anime style) is used by default.
     */
    public void setStyles(String [] Styles) {
        this.Styles = Styles;
    }

    /**
     * Get Configurations of the generated image, including the resolution.
Images with the following resolutions can be generated: origin (The resolution is the same as the input image resolution, with the edge resolution of up to 2000. The image will be zoomed out proportionally if the resolution is exceeded.), 768:768 (1:1), 768:1024 (3:4), and 1024:768 (4:3).
If the resolution is not specified, origin is used by default. 
     * @return ResultConfig Configurations of the generated image, including the resolution.
Images with the following resolutions can be generated: origin (The resolution is the same as the input image resolution, with the edge resolution of up to 2000. The image will be zoomed out proportionally if the resolution is exceeded.), 768:768 (1:1), 768:1024 (3:4), and 1024:768 (4:3).
If the resolution is not specified, origin is used by default.
     */
    public ResultConfig getResultConfig() {
        return this.ResultConfig;
    }

    /**
     * Set Configurations of the generated image, including the resolution.
Images with the following resolutions can be generated: origin (The resolution is the same as the input image resolution, with the edge resolution of up to 2000. The image will be zoomed out proportionally if the resolution is exceeded.), 768:768 (1:1), 768:1024 (3:4), and 1024:768 (4:3).
If the resolution is not specified, origin is used by default.
     * @param ResultConfig Configurations of the generated image, including the resolution.
Images with the following resolutions can be generated: origin (The resolution is the same as the input image resolution, with the edge resolution of up to 2000. The image will be zoomed out proportionally if the resolution is exceeded.), 768:768 (1:1), 768:1024 (3:4), and 1024:768 (4:3).
If the resolution is not specified, origin is used by default.
     */
    public void setResultConfig(ResultConfig ResultConfig) {
        this.ResultConfig = ResultConfig;
    }

    /**
     * Get Switch indicating whether to add a logo to the generated image. Default value: 1.
1: add logo
0: do not add logo
Other values: add logo
It is recommended to use an obvious logo to indicate that the image result is generated by AI. 
     * @return LogoAdd Switch indicating whether to add a logo to the generated image. Default value: 1.
1: add logo
0: do not add logo
Other values: add logo
It is recommended to use an obvious logo to indicate that the image result is generated by AI.
     */
    public Long getLogoAdd() {
        return this.LogoAdd;
    }

    /**
     * Set Switch indicating whether to add a logo to the generated image. Default value: 1.
1: add logo
0: do not add logo
Other values: add logo
It is recommended to use an obvious logo to indicate that the image result is generated by AI.
     * @param LogoAdd Switch indicating whether to add a logo to the generated image. Default value: 1.
1: add logo
0: do not add logo
Other values: add logo
It is recommended to use an obvious logo to indicate that the image result is generated by AI.
     */
    public void setLogoAdd(Long LogoAdd) {
        this.LogoAdd = LogoAdd;
    }

    /**
     * Get Logo content settings.
By default, the text "Generated by AI" is added to the bottom right corner of the generated image. You can also use other logo. 
     * @return LogoParam Logo content settings.
By default, the text "Generated by AI" is added to the bottom right corner of the generated image. You can also use other logo.
     */
    public LogoParam getLogoParam() {
        return this.LogoParam;
    }

    /**
     * Set Logo content settings.
By default, the text "Generated by AI" is added to the bottom right corner of the generated image. You can also use other logo.
     * @param LogoParam Logo content settings.
By default, the text "Generated by AI" is added to the bottom right corner of the generated image. You can also use other logo.
     */
    public void setLogoParam(LogoParam LogoParam) {
        this.LogoParam = LogoParam;
    }

    /**
     * Get Generation strength.
The smaller the strength value, the more the generated image resembles the original image. Value range: (0, 1]. If the strength is not specified, the default value of the model is used.
The recommended value range is 0.6 to 0.8. 
     * @return Strength Generation strength.
The smaller the strength value, the more the generated image resembles the original image. Value range: (0, 1]. If the strength is not specified, the default value of the model is used.
The recommended value range is 0.6 to 0.8.
     */
    public Float getStrength() {
        return this.Strength;
    }

    /**
     * Set Generation strength.
The smaller the strength value, the more the generated image resembles the original image. Value range: (0, 1]. If the strength is not specified, the default value of the model is used.
The recommended value range is 0.6 to 0.8.
     * @param Strength Generation strength.
The smaller the strength value, the more the generated image resembles the original image. Value range: (0, 1]. If the strength is not specified, the default value of the model is used.
The recommended value range is 0.6 to 0.8.
     */
    public void setStrength(Float Strength) {
        this.Strength = Strength;
    }

    /**
     * Get Image return method (base64 or url).
You can specify only one method. Default value: base64.
The URL is valid for 1 hour. 
     * @return RspImgType Image return method (base64 or url).
You can specify only one method. Default value: base64.
The URL is valid for 1 hour.
     */
    public String getRspImgType() {
        return this.RspImgType;
    }

    /**
     * Set Image return method (base64 or url).
You can specify only one method. Default value: base64.
The URL is valid for 1 hour.
     * @param RspImgType Image return method (base64 or url).
You can specify only one method. Default value: base64.
The URL is valid for 1 hour.
     */
    public void setRspImgType(String RspImgType) {
        this.RspImgType = RspImgType;
    }

    /**
     * Get Switch indicating whether to  enhance image clarity. Default value: 0.
1: on
0: off
If the switch is turned on, the image clarity will be enhanced, but the generation time will increase. 
     * @return EnhanceImage Switch indicating whether to  enhance image clarity. Default value: 0.
1: on
0: off
If the switch is turned on, the image clarity will be enhanced, but the generation time will increase.
     */
    public Long getEnhanceImage() {
        return this.EnhanceImage;
    }

    /**
     * Set Switch indicating whether to  enhance image clarity. Default value: 0.
1: on
0: off
If the switch is turned on, the image clarity will be enhanced, but the generation time will increase.
     * @param EnhanceImage Switch indicating whether to  enhance image clarity. Default value: 0.
1: on
0: off
If the switch is turned on, the image clarity will be enhanced, but the generation time will increase.
     */
    public void setEnhanceImage(Long EnhanceImage) {
        this.EnhanceImage = EnhanceImage;
    }

    /**
     * Get Maximum number of faces for detail restoration. Value range: 0 - 6. Default value: 0.
If the input value is greater than 0, the value will be used as the maximum number of faces with a small area can be restored in each image. The generation time will increase according to the actual number of faces restored. 
     * @return RestoreFace Maximum number of faces for detail restoration. Value range: 0 - 6. Default value: 0.
If the input value is greater than 0, the value will be used as the maximum number of faces with a small area can be restored in each image. The generation time will increase according to the actual number of faces restored.
     */
    public Long getRestoreFace() {
        return this.RestoreFace;
    }

    /**
     * Set Maximum number of faces for detail restoration. Value range: 0 - 6. Default value: 0.
If the input value is greater than 0, the value will be used as the maximum number of faces with a small area can be restored in each image. The generation time will increase according to the actual number of faces restored.
     * @param RestoreFace Maximum number of faces for detail restoration. Value range: 0 - 6. Default value: 0.
If the input value is greater than 0, the value will be used as the maximum number of faces with a small area can be restored in each image. The generation time will increase according to the actual number of faces restored.
     */
    public void setRestoreFace(Long RestoreFace) {
        this.RestoreFace = RestoreFace;
    }

    public ImageToImageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageToImageRequest(ImageToImageRequest source) {
        if (source.InputImage != null) {
            this.InputImage = new String(source.InputImage);
        }
        if (source.InputUrl != null) {
            this.InputUrl = new String(source.InputUrl);
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.NegativePrompt != null) {
            this.NegativePrompt = new String(source.NegativePrompt);
        }
        if (source.Styles != null) {
            this.Styles = new String[source.Styles.length];
            for (int i = 0; i < source.Styles.length; i++) {
                this.Styles[i] = new String(source.Styles[i]);
            }
        }
        if (source.ResultConfig != null) {
            this.ResultConfig = new ResultConfig(source.ResultConfig);
        }
        if (source.LogoAdd != null) {
            this.LogoAdd = new Long(source.LogoAdd);
        }
        if (source.LogoParam != null) {
            this.LogoParam = new LogoParam(source.LogoParam);
        }
        if (source.Strength != null) {
            this.Strength = new Float(source.Strength);
        }
        if (source.RspImgType != null) {
            this.RspImgType = new String(source.RspImgType);
        }
        if (source.EnhanceImage != null) {
            this.EnhanceImage = new Long(source.EnhanceImage);
        }
        if (source.RestoreFace != null) {
            this.RestoreFace = new Long(source.RestoreFace);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InputImage", this.InputImage);
        this.setParamSimple(map, prefix + "InputUrl", this.InputUrl);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "NegativePrompt", this.NegativePrompt);
        this.setParamArraySimple(map, prefix + "Styles.", this.Styles);
        this.setParamObj(map, prefix + "ResultConfig.", this.ResultConfig);
        this.setParamSimple(map, prefix + "LogoAdd", this.LogoAdd);
        this.setParamObj(map, prefix + "LogoParam.", this.LogoParam);
        this.setParamSimple(map, prefix + "Strength", this.Strength);
        this.setParamSimple(map, prefix + "RspImgType", this.RspImgType);
        this.setParamSimple(map, prefix + "EnhanceImage", this.EnhanceImage);
        this.setParamSimple(map, prefix + "RestoreFace", this.RestoreFace);

    }
}

