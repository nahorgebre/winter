/*
 * Copyright (c) 2017 Data and Web Science Group, University of Mannheim, Germany (http://dws.informatik.uni-mannheim.de/)
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */
package de.uni_mannheim.informatik.dws.winter.processing;

import de.uni_mannheim.informatik.dws.winter.model.Pair;

/**
 * 
 * Function that returns the key of a given {@link Pair}.
 * 
 * @author Oliver Lehmberg (oli@dwslab.de)
 *
 */
public class PairFirstJoinKeyGenerator<T, U> implements Function<T, Pair<T, U>> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/* (non-Javadoc)
	 * @see de.uni_mannheim.informatik.wdi.processing.Function#execute(java.lang.Object)
	 */
	@Override
	public T execute(Pair<T, U> input) {
		return input.getFirst();
	}

}
