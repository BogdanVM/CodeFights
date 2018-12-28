def addBorder(picture):
    noCols = len(picture[0]) + 2
    borderedPicture = [0] * (len(picture) + 2)

    borderedPicture[0] = "*" * noCols
    borderedPicture[len(borderedPicture) - 1] = "*" * noCols

    for i in range(1, len(borderedPicture) - 1):
        borderedPicture[i] = "*" + picture[i - 1] + "*"

    return borderedPicture