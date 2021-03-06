/*******************************************************************************
 * 	Copyright 2016 ContainX and OpenStack4j                                          
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
package com.huawei.openstack4j.model.network.ext.status;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.huawei.openstack4j.model.ModelEntity;
import com.huawei.openstack4j.openstack.networking.domain.ext.LoadBalancerV2StatusTree.NeutronMemberV2Status;

/**
 * The status of an lbaas v2 member
 * @author emjburns
 */
@JsonDeserialize(as = NeutronMemberV2Status.class)
public interface MemberV2Status extends ModelEntity {
    /**
     * The id of the member
     * @return id
     */
    public String getId();

    /**
     * The address of the memeber
     * @return address
     */
    public String getAddress();

    /**
     * The protocol port of the member
     * @return protocol port
     */
    public Integer getProtocolPort();

    /**
     * The operating status of the member
     * @return operating status
     */
    public String getOperatingStatus();

    /**
     * The provisioning status of the member
     * @return provisioning status
     */
    public String getProvisioningStatus();
}
