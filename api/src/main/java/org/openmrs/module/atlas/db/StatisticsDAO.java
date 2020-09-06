/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.atlas.db;

import org.openmrs.api.db.DAOException;

/**
 * Provides database access to statistics (counts of patients, encounters, and observations) for the
 * Atlas Module.
 */
public interface StatisticsDAO {
	
	/**
	 * Method that returns the number of non-voided patients
	 * 
	 * @return the number of non-voided patients
	 * @throws DAOException
	 */
	public Long getNumberOfPatients() throws DAOException;
	
	/**
	 * Method that returns the number of non-voided encounters
	 * 
	 * @return the number of non-voided encounters
	 * @throws DAOException
	 */
	public Long getNumberOfEncounters() throws DAOException;
	
	/**
	 * Method that returns the number of non-voided observations
	 * 
	 * @return the number of non-voided observations
	 * @throws DAOException
	 */
	public Long getNumberOfObservations() throws DAOException;
	
}
