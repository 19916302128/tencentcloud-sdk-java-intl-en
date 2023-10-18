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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoginConfiguration extends AbstractModel {

    /**
    * <li>`YES`: Random password. In this case, `Password` cannot be specified. </li>
<li>`No`: Custom. `Password` must be specified. </li>
    */
    @SerializedName("AutoGeneratePassword")
    @Expose
    private String AutoGeneratePassword;

    /**
    * Instace login password.
For Windows instances, the password must contain 12 to 30 characters of the following types. It cannot start with “/” and cannot include the username.
<li>[a-z]</li>
<li>[A-Z]</li>
<li>[0-9]</li>
<li>[()`~!@#$%^&*-+=_|{}[]:;' <>,.?/]</li>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
     * Get <li>`YES`: Random password. In this case, `Password` cannot be specified. </li>
<li>`No`: Custom. `Password` must be specified. </li> 
     * @return AutoGeneratePassword <li>`YES`: Random password. In this case, `Password` cannot be specified. </li>
<li>`No`: Custom. `Password` must be specified. </li>
     */
    public String getAutoGeneratePassword() {
        return this.AutoGeneratePassword;
    }

    /**
     * Set <li>`YES`: Random password. In this case, `Password` cannot be specified. </li>
<li>`No`: Custom. `Password` must be specified. </li>
     * @param AutoGeneratePassword <li>`YES`: Random password. In this case, `Password` cannot be specified. </li>
<li>`No`: Custom. `Password` must be specified. </li>
     */
    public void setAutoGeneratePassword(String AutoGeneratePassword) {
        this.AutoGeneratePassword = AutoGeneratePassword;
    }

    /**
     * Get Instace login password.
For Windows instances, the password must contain 12 to 30 characters of the following types. It cannot start with “/” and cannot include the username.
<li>[a-z]</li>
<li>[A-Z]</li>
<li>[0-9]</li>
<li>[()`~!@#$%^&*-+=_|{}[]:;' <>,.?/]</li> 
     * @return Password Instace login password.
For Windows instances, the password must contain 12 to 30 characters of the following types. It cannot start with “/” and cannot include the username.
<li>[a-z]</li>
<li>[A-Z]</li>
<li>[0-9]</li>
<li>[()`~!@#$%^&*-+=_|{}[]:;' <>,.?/]</li>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Instace login password.
For Windows instances, the password must contain 12 to 30 characters of the following types. It cannot start with “/” and cannot include the username.
<li>[a-z]</li>
<li>[A-Z]</li>
<li>[0-9]</li>
<li>[()`~!@#$%^&*-+=_|{}[]:;' <>,.?/]</li>
     * @param Password Instace login password.
For Windows instances, the password must contain 12 to 30 characters of the following types. It cannot start with “/” and cannot include the username.
<li>[a-z]</li>
<li>[A-Z]</li>
<li>[0-9]</li>
<li>[()`~!@#$%^&*-+=_|{}[]:;' <>,.?/]</li>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    public LoginConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoginConfiguration(LoginConfiguration source) {
        if (source.AutoGeneratePassword != null) {
            this.AutoGeneratePassword = new String(source.AutoGeneratePassword);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoGeneratePassword", this.AutoGeneratePassword);
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

