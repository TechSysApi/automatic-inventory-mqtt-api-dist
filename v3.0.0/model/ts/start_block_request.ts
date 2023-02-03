import { DateTime } from 'apikana/default-types'
import { UUID } from 'apikana/default-types'

export interface StartBlockRequest {
    /**
     * The date+timestamp which identifies the point in time when the app requested starting the block.
     *
     * @format date-time
     */
    startTimestamp: DateTime

    /**
     * Unique identifier of the sorting unit at a location.
     * @maxLength 200
     */
    sortingUnitKey: string

    /**
     * The id of the feeding line where the block should be started.
     *
     */
    feedingLineId: string

    /**
     * The Id of the block to be started at the feeding line.
     */
    blockId: UUID
}
