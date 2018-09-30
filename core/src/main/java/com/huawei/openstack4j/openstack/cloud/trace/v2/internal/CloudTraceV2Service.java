/*******************************************************************************
 * 	Copyright 2017 HuaWei TLD and OTC                                          
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
package com.huawei.openstack4j.openstack.cloud.trace.v2.internal;

import com.huawei.openstack4j.api.Apis;
import com.huawei.openstack4j.common.RestService;
import com.huawei.openstack4j.openstack.internal.BaseOpenStackService;

/**
 * 
 *
 * @author QianBiao.NG
 * @date   2017-07-13 09:31:29
 */
public class CloudTraceV2Service extends BaseOpenStackService implements RestService {


	/**
	 * get V1 trace operation service instance
	 * 
	 * @return
	 */
	public TraceService traces() {
		return Apis.get(TraceService.class);
	}

}