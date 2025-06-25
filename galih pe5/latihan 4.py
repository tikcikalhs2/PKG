daftar_pertanyaan=[
    'Berapa nilai 5 + 5',
    'Berapa nilai 5 x 5',
    'Berapa nilai 5 x 10',
    'Berapa nilai 10 : 2'
    ]

daftar_jawaban=[
    '10',
    '25',
    '50',
    '5'
]

jawaban_benar=0
indeks = 0
while indeks < len(daftar_pertanyaan) :
    print(daftar_pertanyaan[indeks])

    jawaban=input('jawaban:')
    print('jawaban kamu:',jawaban)

    if jawaban==daftar_jawaban[indeks]:
        print(' Jawaban Benar')
        jawaban_benar=jawaban_benar+1
    else:
        print(' jawaban salah')
        print('jawaban yang benar adalah:',daftar_jawaban[indeks])
    indeks=indeks+1


print('kamu menjawab',jawaban_benar, 'Jawaban benar')

print('')
print('============================================')
skor=jawaban_benar/len (daftar_pertanyaan)*10.0
print('skor kamu:', skor)

if skor>=7.5:
    print('Kamu lolos kuis nya')
else:
    print('Nilai mu masih kurang')

print('============================================')