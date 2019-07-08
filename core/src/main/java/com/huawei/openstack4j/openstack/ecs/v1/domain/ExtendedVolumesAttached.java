/*******************************************************************************
 * 	Copyright 2019 Huawei Technologies Co.,Ltd.
 *
 * 	Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * 	use this file except in compliance with the License. You may obtain a copy of
 * 	the License at
 *
 * 	    http://www.apache.org/licenses/LICENSE-2.0
 *
 * 	Unless required by applicable law or agreed to in writing, software
 * 	distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * 	WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * 	License for the specific language governing permissions and limitations under
 * 	the License.
 *******************************************************************************/
package com.huawei.openstack4j.openstack.ecs.v1.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.huawei.openstack4j.openstack.common.IdResourceEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown=true)
public class ExtendedVolumesAttached extends IdResourceEntity {
    private static final long serialVersionUID = 1L;

    @JsonProperty("delete_on_termination")
    private String deleteOnTermination;

    @JsonProperty("bootIndex")
    private String bootIndex;

    @JsonProperty("device")
    private String device;

    public ExtendedVolumesAttached(String id){
        setId(id);
    }

    public ExtendedVolumesAttached(String id, String deleteOnTermination, String bootIndex, String device) {
        setId(id);
        this.deleteOnTermination = deleteOnTermination;
        this.bootIndex = bootIndex;
        this.device = device;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass()).omitNullValues().add("id", getId()).
                add("deleteOnTermination", deleteOnTermination).
                add("bootIndex", bootIndex).add("device", device).toString();
    }
}
