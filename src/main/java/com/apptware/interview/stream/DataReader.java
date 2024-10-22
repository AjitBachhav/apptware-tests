package com.apptware.interview.stream;

import java.util.stream.Stream;

public interface DataReader {

    /**
     * Fetches a limited amount of data as a stream.
     *
     * @param limit the maximum number of items to fetch
     * @return a stream containing up to the specified number of items
     */
    Stream<String> fetchLimitedData(int limit);

    /**
     * Fetches the full set of data as a stream.
     *
     * @return a stream containing all available data
     */
    Stream<String> fetchFullData();
}
