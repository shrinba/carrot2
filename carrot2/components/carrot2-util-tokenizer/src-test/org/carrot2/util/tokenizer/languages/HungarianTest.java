
/*
 * Carrot2 project.
 *
 * Copyright (C) 2002-2008, Dawid Weiss, Stanisław Osiński.
 * Portions (C) Contributors listed in "carrot2.CONTRIBUTORS" file.
 * All rights reserved.
 *
 * Refer to the full license file "carrot2.LICENSE"
 * in the root folder of the repository checkout or at:
 * http://www.carrot2.org/carrot2.LICENSE
 */

package org.carrot2.util.tokenizer.languages;

import org.carrot2.core.linguistic.Language;
import org.carrot2.util.tokenizer.languages.hungarian.Hungarian;

/**
 * Hungarian language test.
 *  
 * @author Dawid Weiss
 */
public class HungarianTest extends LanguageImplTestBase {

	public HungarianTest(String methodName) {
		super(methodName);
	}
    
	/*
	 * @see org.carrot2.util.tokenizer.languages.LanguageImplTestBase#getLanguageInstance()
	 */
	protected Language getLanguageInstance() {
        return new Hungarian();
	}

    /**
     * 
     */
    protected String [][] getWordsToCompare() {
        return new String [][] {
                {"nyelvek", "nyelv"},
                {"barátok", "barát"},
                {"városok", "város"},
                {"várost",  "város"}
        };
    }

}
