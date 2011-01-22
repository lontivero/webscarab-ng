/**
 * 
 */
package org.owasp.webscarab.jdbc;

import org.owasp.webscarab.domain.NamedValue;

/**
 * @author rdawes
 *
 */
public interface NamedValueDao {

    Integer findNamedValueId(NamedValue nv);
    
    NamedValue findNamedValue(Integer id);

    NamedValue findNamedValue(String name);

    Integer saveNamedValue(NamedValue nv);
    
}
