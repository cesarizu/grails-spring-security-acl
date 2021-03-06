/* Copyright 2009-2013 SpringSource.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package test

import grails.plugin.springsecurity.annotation.Secured

class TestSecureService {

	static transactional = false

	@Secured(['ROLE_RUN_AS_SUPERUSER'])
	String method1() {
		'method1'
	}

	@Secured(['ROLE_SUPERUSER', 'ROLE_RUN_AS_SUPERUSER'])
	String method2() {
		'method2'
	}

	@Secured(['ROLE_SUPERUSER'])
	String method3() {
		'method3'
	}
}
