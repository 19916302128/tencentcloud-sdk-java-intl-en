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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Origin extends AbstractModel{

    /**
    * Primary origin server list
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Origins")
    @Expose
    private String [] Origins;

    /**
    * The list of backup origin servers.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BackupOrigins")
    @Expose
    private String [] BackupOrigins;

    /**
    * Origin-pull protocol configuration. Values:
<li>`http`: Force HTTP for origin-pull.</li>
<li>`follow`: Follow protocol.</li>
<li>`https`: Force HTTPS for origin-pull. This only supports port 443 on the origin server.</li>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OriginPullProtocol")
    @Expose
    private String OriginPullProtocol;

    /**
    * When OriginType is COS, you can specify if access to private buckets is allowed.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CosPrivateAccess")
    @Expose
    private String CosPrivateAccess;

    /**
     * Get Primary origin server list
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Origins Primary origin server list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getOrigins() {
        return this.Origins;
    }

    /**
     * Set Primary origin server list
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Origins Primary origin server list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOrigins(String [] Origins) {
        this.Origins = Origins;
    }

    /**
     * Get The list of backup origin servers.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BackupOrigins The list of backup origin servers.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getBackupOrigins() {
        return this.BackupOrigins;
    }

    /**
     * Set The list of backup origin servers.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BackupOrigins The list of backup origin servers.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBackupOrigins(String [] BackupOrigins) {
        this.BackupOrigins = BackupOrigins;
    }

    /**
     * Get Origin-pull protocol configuration. Values:
<li>`http`: Force HTTP for origin-pull.</li>
<li>`follow`: Follow protocol.</li>
<li>`https`: Force HTTPS for origin-pull. This only supports port 443 on the origin server.</li>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OriginPullProtocol Origin-pull protocol configuration. Values:
<li>`http`: Force HTTP for origin-pull.</li>
<li>`follow`: Follow protocol.</li>
<li>`https`: Force HTTPS for origin-pull. This only supports port 443 on the origin server.</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOriginPullProtocol() {
        return this.OriginPullProtocol;
    }

    /**
     * Set Origin-pull protocol configuration. Values:
<li>`http`: Force HTTP for origin-pull.</li>
<li>`follow`: Follow protocol.</li>
<li>`https`: Force HTTPS for origin-pull. This only supports port 443 on the origin server.</li>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OriginPullProtocol Origin-pull protocol configuration. Values:
<li>`http`: Force HTTP for origin-pull.</li>
<li>`follow`: Follow protocol.</li>
<li>`https`: Force HTTPS for origin-pull. This only supports port 443 on the origin server.</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOriginPullProtocol(String OriginPullProtocol) {
        this.OriginPullProtocol = OriginPullProtocol;
    }

    /**
     * Get When OriginType is COS, you can specify if access to private buckets is allowed.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CosPrivateAccess When OriginType is COS, you can specify if access to private buckets is allowed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCosPrivateAccess() {
        return this.CosPrivateAccess;
    }

    /**
     * Set When OriginType is COS, you can specify if access to private buckets is allowed.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CosPrivateAccess When OriginType is COS, you can specify if access to private buckets is allowed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCosPrivateAccess(String CosPrivateAccess) {
        this.CosPrivateAccess = CosPrivateAccess;
    }

    public Origin() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Origin(Origin source) {
        if (source.Origins != null) {
            this.Origins = new String[source.Origins.length];
            for (int i = 0; i < source.Origins.length; i++) {
                this.Origins[i] = new String(source.Origins[i]);
            }
        }
        if (source.BackupOrigins != null) {
            this.BackupOrigins = new String[source.BackupOrigins.length];
            for (int i = 0; i < source.BackupOrigins.length; i++) {
                this.BackupOrigins[i] = new String(source.BackupOrigins[i]);
            }
        }
        if (source.OriginPullProtocol != null) {
            this.OriginPullProtocol = new String(source.OriginPullProtocol);
        }
        if (source.CosPrivateAccess != null) {
            this.CosPrivateAccess = new String(source.CosPrivateAccess);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Origins.", this.Origins);
        this.setParamArraySimple(map, prefix + "BackupOrigins.", this.BackupOrigins);
        this.setParamSimple(map, prefix + "OriginPullProtocol", this.OriginPullProtocol);
        this.setParamSimple(map, prefix + "CosPrivateAccess", this.CosPrivateAccess);

    }
}

