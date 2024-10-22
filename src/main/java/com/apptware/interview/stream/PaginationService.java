package com.apptware.interview.stream;

import java.util.List;

public interface PaginationService {

    // Constant representing the full size of the data set
    int FULL_DATA_SIZE = 10000;

    /**
     * Retrieves a paginated list of data.
     *
     * @param page the page number to retrieve (1-based index)
     * @param pageSize the number of items per page
     * @return a list containing the data for the specified page
     */
    List<String> getPaginatedData(int page, int pageSize);
}
